import {Routes, Route} from "react-router-dom";
import React from 'react';
import Category from "./components/Category";
import Product from "./components/Product";

function App() {
    return (
        <Routes>
            <Route path="/" element={<Category />} />
            <Route path="/product/:categoryId" element={<Product />} />
        </Routes>
    );
}

export default App;