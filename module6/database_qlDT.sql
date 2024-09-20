-- Create UserRoles table first as it is referenced by Users table
CREATE TABLE UserRoles (
    RoleID INT PRIMARY KEY AUTO_INCREMENT,
    RoleName VARCHAR(50) NOT NULL
);

-- Create Users table
CREATE TABLE Users (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    Username VARCHAR(50) NOT NULL,
    PasswordHash VARCHAR(255) NOT NULL,
    RoleID INT NOT NULL,
    FOREIGN KEY (RoleID) REFERENCES UserRoles(RoleID)
);

-- Create Products table
CREATE TABLE Products (
    ProductID INT PRIMARY KEY AUTO_INCREMENT,
    ProductName VARCHAR(200) NOT NULL,
    Price DECIMAL(10,2) NOT NULL,
    ScreenSize VARCHAR(20),
    Camera VARCHAR(50),
    Selfie VARCHAR(50),
    CPU VARCHAR(50),
    Storage VARCHAR(50),
    Description TEXT,
    Stock INT DEFAULT 0
);

-- Create ProductImages table
CREATE TABLE ProductImages (
    ImageID INT PRIMARY KEY AUTO_INCREMENT,
    ProductID INT,
    ImagePath VARCHAR(255) NOT NULL,
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

-- Create ProductCategories table
CREATE TABLE ProductCategories (
    CategoryID INT PRIMARY KEY AUTO_INCREMENT,
    CategoryName VARCHAR(50) NOT NULL
);

-- Create ProductCategoryMapping table
CREATE TABLE ProductCategoryMapping (
    ProductID INT,
    CategoryID INT,
    PRIMARY KEY (ProductID, CategoryID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
    FOREIGN KEY (CategoryID) REFERENCES ProductCategories(CategoryID)
);

-- Insert roles into UserRoles table
INSERT INTO UserRoles (RoleName) VALUES ('Admin'), ('SalesStaff'), ('BusinessStaff');

-- Insert users into Users table
INSERT INTO Users (Username, PasswordHash, RoleID) VALUES 
('admin_user', 'hashed_password1', 1), 
('sales_user', 'hashed_password2', 2), 
('business_user', 'hashed_password3', 3);

-- Insert product into Products table
INSERT INTO Products (ProductName, Price, ScreenSize, Camera, Selfie, CPU, Storage, Description, Stock) VALUES 
('OPPO Reno7', 8490000.00, '6.4 inch', '64.0 MP', '32.0 MP', 'Snapdragon 680', '128 GB', 'Thiết kế cổ điển, cùng sắc màu thời thượng, OPPO Reno7 mang tới nét đẹp độc đáo và đầy sự sáng tạo cho người dùng Gen Z...', 100);

-- Insert images into ProductImages table
INSERT INTO ProductImages (ProductID, ImagePath) VALUES 
(1, '/path/to/image1.jpg'), 
(1, '/path/to/image2.jpg');

-- Insert categories into ProductCategories table
INSERT INTO ProductCategories (CategoryName) VALUES ('Smartphone');

-- Map product to categories in ProductCategoryMapping table
INSERT INTO ProductCategoryMapping (ProductID, CategoryID) VALUES 
(1, 1); 
