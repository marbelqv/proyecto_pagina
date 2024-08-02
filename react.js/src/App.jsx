
import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import "./form.css"

function App() {
 const [usuario, setusuario] = useState('')
 const [password, setpassword] = useState('')
 
function cambiarusuario (evento){
  setusuario(evento.target.value)

}

function cambiarclave (evento){
setpassword(evento.target.value)
}

function ingresar (evento){
  if (usuario == 'usuario' && password == 'admin'){
    alert('ingreso con exito')
    
  }else{
    alert('error')
  }
}





  return (
    <>
    
    <h1>login</h1>
    <form className='formulario'>
    
    <label htmlFor="usuario">usuario</label>
      <input type="usuario" name='' id='usuario' value={usuario} onChange={cambiarusuario} />
      
      
      <label htmlFor="clave">clave</label>
      <input type = "password" id='password' value={password} onChange={cambiarclave}/>
     
      

      <button onClick={ingresar}> iniciar sesion </button>
       
      </form> 
    </>
  )
}

export default App
