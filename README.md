<h1 align="center"> Conversor Múltiple - Challenge Alura ONE </h1>

<em>El programa que aquí se prensenta corresponde al Challenge de Alura ONE de crear un Conversor de diversas categorías en lenguaje JAVA</em> 
<p align="center">
   <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678229435/Conversor%20Challenge%20-%20Alura%20ONE/java1_m0rcls.png">
</p>

## :hammer:Funcionalidades del proyecto

### Descripción del Challenge 📋

El desafío consta de crear un conversor de divisas utilizando el lenguaje Java. Las características solicitadas por el cliente son:

### - `Requisitos`:
- Convertir de la moneda de tu país a Dólar
- Convertir de la moneda de tu país  a Euros
- Convertir de la moneda de tu país  a Libras Esterlinas
- Convertir de la moneda de tu país  a Yen Japonés
- Convertir de la moneda de tu país  a Won sul-coreano
- Convertir de Dólar a la moneda de tu país
- Convertir de Euros a la moneda de tu país
- Convertir de Libras Esterlinas a la moneda de tu país
- Convertir de Yen Japonés a la moneda de tu país
- Convertir de Won sul-coreano a la moneda de tu país

### - `Extras`:
- Como desafío extra se anima a que dejes fluir tu creatividad realizando otros tipos de conversores.

### Funcionalidades del Proyecto 📋
<p align="center">
   <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678234083/Conversor%20Challenge%20-%20Alura%20ONE/conversor_zimlv9.jpg">
   <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678234083/Conversor%20Challenge%20-%20Alura%20ONE/conversor1_sccpbg.jpg">
</p>

### - `Conversor Moneda`:
- Peso a Dola y viceversa
- Peso a Euro y viceversa
- Peso a Libras Esterlinas y viceversa
- Peso a Won Surcoreano y viceversa
- Peso a Yen Japonés y viceversa
<p align="center">
   <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678312422/Conversor%20Challenge%20-%20Alura%20ONE/conversor-moneda_ruqqwa.jpg">
   <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678312422/Conversor%20Challenge%20-%20Alura%20ONE/conversor-moneda-1_svulp9.jpg">
</p>

### - `Conversor Temperatura`:
- Celsius a Fahrenheit
- Celsius a Kelvin
- Fahrenheit a Celsius
- Fahrenheit a Kelvin
- Kelvin a Celsius
- Kelvin a Fahrenheit
<p align="center">
   <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678312422/Conversor%20Challenge%20-%20Alura%20ONE/conversor-temperatura_ydl7t2.jpg">
   <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678312422/Conversor%20Challenge%20-%20Alura%20ONE/conversor-temperatura-1_kwvjxj.jpg">
</p>

### - `Conversor Longitudes`:
- Kilómetros a Millas
- Millas a Kilómetros
descripción de la funcionalidad 2
- `Estructura del proyecto`: descripción de la funcionalidade 2a relacionada con la funcionalidad 2
<p align="center">
   <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678312421/Conversor%20Challenge%20-%20Alura%20ONE/conversor-longitud_fhp3ne.jpg">
   <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678312421/Conversor%20Challenge%20-%20Alura%20ONE/conversor-longitud-1_pyrjqj.jpg">
</p>

### Estructura del proyecto 📋
#### - " paquete del main 🖇️ "
El proyecto cuenta con un main donde sólo se llama al método "menu()" del servicio.

<p align="center">
  <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678229436/Conversor%20Challenge%20-%20Alura%20ONE/main_iysdg9.jpg">
 </p>

#### - " paquete servicio 🖇️ "
En el servicio se encuentran los métodos necesarios para llevar a cabo las conversiones necesarias y el correcto funcionamiento del programa frente a errores del usuario. 
Entre ellos se encuentran:

Llamados a otros servicios:
<p align="center">
  <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678229434/Conversor%20Challenge%20-%20Alura%20ONE/menu-servicio-contructores_umnsh4.jpg">
 </p>

Método menú donde se selecciona el conversor 
<p align="center">
  <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678229433/Conversor%20Challenge%20-%20Alura%20ONE/menu-seleccion-conversor_kggyol.jpg">
 </p>
 
Método para convertir divisas
<p align="center">
  <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678229435/Conversor%20Challenge%20-%20Alura%20ONE/menu-conversor-moneda_zvdr87.jpg">
 </p>
 
Método para convertir temperaturas
<p align="center">
  <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678229434/Conversor%20Challenge%20-%20Alura%20ONE/menu-conversor-temperatura_mqyxpm.jpg">
 </p>
 
Método para convertir longitudes
<p align="center">
  <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678229434/Conversor%20Challenge%20-%20Alura%20ONE/menu-conversor-longitudes_gbktnr.jpg">
 </p>
 
Método para convertir lo ingresar el dato y método para convertir a double el String recibido.
<p align="center">
  <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678229435/Conversor%20Challenge%20-%20Alura%20ONE/metodos-extras_l9qbst.jpg">
 </p>

#### - " estructura general 🖇️ "

- Paquete entidades que contiene una clase Moneda cuyos atibutos son el valor de cada moneda (dolar, euro, libras esterlinas, won surcoreano, yen japonés) con respecto al peso.
- Paquete errores que contiene una clase ErroresMoneda para tratar los errores en la lógica del proyecto.
<p align="center">
  <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678229435/Conversor%20Challenge%20-%20Alura%20ONE/estructura_mtcqyq.jpg">
 </p>

- `Abre y ejecuta el proyecto`:
### Detalles Extras 📋
- Mensaje para cerrar el programa
<p align="center">
  <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678312422/Conversor%20Challenge%20-%20Alura%20ONE/mensaje-pregunta_gytmg2.jpg">
 </p>
 
- Mensaje de despedida
<p align="center">
  <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678312422/Conversor%20Challenge%20-%20Alura%20ONE/mensaje-despedida_cdo7lx.jpg">
 </p>
 
 ### Video del proyecto 📋
 [Conversor.webm](https://user-images.githubusercontent.com/110341896/224116155-adff8206-7244-448a-8958-1c4b993cbdd3.webm)
 
 ### Insignia del Proyecto 📋
Insignia recibida por haber completado el Challenge
<p align="center">
   <img src="https://res.cloudinary.com/dbaqfw9vn/image/upload/v1678312423/Conversor%20Challenge%20-%20Alura%20ONE/cms_files_10224_1671211831Prancheta_8_yiws3v.png">
</p>
