import { use, useState } from 'react'
import './App.css'
import { useEffect } from 'react'
import ProductList from './ProductList.jsx' 

function App() {
   const [products, setProducts] = useState([]);
   
   useEffect(() => {
    fetch('http://localhost:8080/api/products')
      .then(response => response.json())
      .then(data => setProducts(data));
   }, []); 

  return (
    <div className='container'>
      <div>
        {products.length ?(
          //Display products
          <ProductList products={products} />
        ):(
          <p>No products Found</p>
        )}
      </div>
      
    </div>
  )
}

export default App
