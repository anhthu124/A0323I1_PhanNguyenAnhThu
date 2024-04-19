package com.example.end_m3.model;

public class Product {
        private int code;
        private String name;
        private int price;
        private int quantily;
        private String color;
        private String description;
        private String categogy;

        public Product() {
        }

        public Product(String name, int price, int quantily, String color, String description, String categogy) {
            this.name = name;
            this.price = price;
            this.quantily = quantily;
            this.color = color;
            this.description = description;
            this.categogy = categogy;
        }

        public Product(int code, String name, int price, int quantily, String color, String description, String categogy) {
            this.code = code;
            this.name = name;
            this.price = price;
            this.quantily = quantily;
            this.color = color;
            this.description = description;
            this.categogy = categogy;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getQuantily() {
            return quantily;
        }

        public void setQuantily(int quantily) {
            this.quantily = quantily;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCategogy() {
            return categogy;
        }

        public void setCategogy(String categogy) {
            this.categogy = categogy;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "code=" + code +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", quantily=" + quantily +
                    ", color='" + color + '\'' +
                    ", description='" + description + '\'' +
                    ", category='" + categogy + '\'' +
                    '}';
        }
    }


