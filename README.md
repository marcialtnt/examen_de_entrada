Exámen de entrada Java SpringBoot
============

Desarrollar un sistema de gestión de empleados que utilice herencia, polimorfismo e interfaces
para representar diferentes tipos de empleados en una empresa.

Clases:
------------

  * Clase Base Empleado
  * Clase Derivada Gerente
  * Clase Derivada Desarrollador

Resolución:
------------

Se crearon las clases en el package models y se crearon datos de prueba en el método main de la clase App.
Se tomó como referencia el siquiente esquema para el llenado de datos:
![alt text](https://github.com/marcialtnt/examen_de_entrada/blob/main/resources/Test-data.png?raw=true)
En donde definimos a los empleados en rojo como gerentes y los que están en azul como desarrolladores.

Resultados obtenidos:
------------

~~~Output
Iniciando aplicación...
|Empleado{id=1, nombre='Christy Prangnell', departamento=GERENCIA, salario=2000.0}
|Desempeño: BUENO
|Equipo de Christy Prangnell: (17 integrantes)------------------------------------------------------
   |Empleado{id=2, nombre='Orsola Sancto', departamento=GERENCIA, salario=2000.0}
   |Desempeño: BUENO
   |Equipo de Orsola Sancto: (5 integrantes)--------------------------------------------------------
      |Empleado{id=3, nombre='Justinn Bartel', departamento=DESARROLLO, salario=1000.0}
      |Desempeño: BUENO
      |Lenguajes: JAVA, PHP, 
      |Bono:500.0
      |Empleado{id=4, nombre='Nikkie Alven', departamento=GERENCIA, salario=1000.0}
      |Desempeño: BUENO
      |Equipo de Nikkie Alven: (3 integrantes)------------------------------------------------------
         |Empleado{id=5, nombre='Claudia Ameer-Beg', departamento=DESARROLLO, salario=1000.0}
         |Desempeño: BUENO
         |Lenguajes: JAVA, VBA, C_CPLUSPLUS, JAVASCRIPT, TYPESCRIPT, 
         |Bono:2000.0
         |Empleado{id=6, nombre='Janith Mont', departamento=DESARROLLO, salario=1000.0}
         |Desempeño: BUENO
         |Lenguajes: JAVA, 
         |Bono:0.0
         |Empleado{id=7, nombre='Alf Feldheim', departamento=DESARROLLO, salario=1000.0}
         |Desempeño: REGULAR
         |Lenguajes: JAVA, C_SHARP, MATLAB, 
         |Bono:500.0
      =Fin equipo de Nikkie Alven===================================================================
   =Fin equipo de Orsola Sancto=====================================================================
   |Empleado{id=8, nombre='Ellie Lermouth', departamento=GERENCIA, salario=2000.0}
   |Desempeño: REGULAR
   |Equipo de Ellie Lermouth: (4 integrantes)-------------------------------------------------------
      |Empleado{id=9, nombre='Moise Maker', departamento=GERENCIA, salario=2000.0}
      |Desempeño: REGULAR
      |Equipo de Moise Maker: (3 integrantes)-------------------------------------------------------
         |Empleado{id=10, nombre='Corbett Scotney', departamento=DESARROLLO, salario=1000.0}
         |Desempeño: REGULAR
         |Lenguajes: JAVA, PYTHON, 
         |Bono:250.0
         |Empleado{id=11, nombre='Bartie Poe', departamento=DESARROLLO, salario=1000.0}
         |Desempeño: REGULAR
         |Lenguajes: JAVA, 
         |Bono:0.0
         |Empleado{id=12, nombre='Kittie Eldrid', departamento=DESARROLLO, salario=1000.0}
         |Desempeño: REGULAR
         |Lenguajes: JAVA, PERL, DELPHI_PASCAL, COBOL, SWIFT, DART, KOTLIN, 
         |Bono:1500.0
      =Fin equipo de Moise Maker====================================================================
   =Fin equipo de Ellie Lermouth====================================================================
   |Empleado{id=13, nombre='Opalina Biernacki', departamento=GERENCIA, salario=2000.0}
   |Desempeño: MALO
   |Equipo de Opalina Biernacki: (5 integrantes)----------------------------------------------------
      |Empleado{id=14, nombre='Nanny Middleditch', departamento=DESARROLLO, salario=2000.0}
      |Desempeño: MALO
      |Lenguajes: JAVA, 
      |Bono:0.0
      |Empleado{id=15, nombre='Lisle Shalloo', departamento=GERENCIA, salario=2000.0}
      |Desempeño: MALO
      |Equipo de Lisle Shalloo: (3 integrantes)-----------------------------------------------------
         |Empleado{id=16, nombre='Burk McAne', departamento=DESARROLLO, salario=1000.0}
         |Desempeño: MALO
         |Lenguajes: JAVA, POWERSHELL, 
         |Bono:0.0
         |Empleado{id=17, nombre='Susana Andrzej', departamento=DESARROLLO, salario=1000.0}
         |Desempeño: MALO
         |Lenguajes: JAVA, LUA, HASKELL, 
         |Bono:0.0
         |Empleado{id=18, nombre='Oralia Ericssen', departamento=DESARROLLO, salario=1000.0}
         |Desempeño: MALO
         |Lenguajes: JAVA, JAVASCRIPT, 
         |Bono:0.0
      =Fin equipo de Lisle Shalloo==================================================================
   =Fin equipo de Opalina Biernacki=================================================================
=Fin equipo de Christy Prangnell====================================================================
----------------------------------------------------------------------------------------------------
Estos son los bonos de fin de año:
----------------------------------------------------------------------------------------------------
01.=Christy Prangnell              Bono ->  10000.00
02.=Orsola Sancto                  Bono ->   5000.00
03.=Justinn Bartel                 Bono ->    500.00
04.=Nikkie Alven                   Bono ->   3000.00
05.=Claudia Ameer-Beg              Bono ->   2000.00
06.=Janith Mont                    Bono ->      0.00
07.=Alf Feldheim                   Bono ->    500.00
08.=Ellie Lermouth                 Bono ->   2000.00
09.=Moise Maker                    Bono ->   1500.00
10.=Corbett Scotney                Bono ->    250.00
11.=Bartie Poe                     Bono ->      0.00
12.=Kittie Eldrid                  Bono ->   1500.00
13.=Opalina Biernacki              Bono ->      0.00
14.=Nanny Middleditch              Bono ->      0.00
15.=Lisle Shalloo                  Bono ->      0.00
16.=Burk McAne                     Bono ->      0.00
17.=Susana Andrzej                 Bono ->      0.00
18.=Oralia Ericssen                Bono ->      0.00
----------------------------------------------------------------------------------------------------
Resultados de la evaluación de desempeño:
----------------------------------------------------------------------------------------------------
01.=Christy Prangnell              Desempeño ->        BUENO
02.=Orsola Sancto                  Desempeño ->        BUENO
03.=Justinn Bartel                 Desempeño ->        BUENO
04.=Nikkie Alven                   Desempeño ->        BUENO
05.=Claudia Ameer-Beg              Desempeño ->        BUENO
06.=Janith Mont                    Desempeño ->        BUENO
07.=Alf Feldheim                   Desempeño ->      REGULAR
08.=Ellie Lermouth                 Desempeño ->      REGULAR
09.=Moise Maker                    Desempeño ->      REGULAR
10.=Corbett Scotney                Desempeño ->      REGULAR
11.=Bartie Poe                     Desempeño ->      REGULAR
12.=Kittie Eldrid                  Desempeño ->      REGULAR
13.=Opalina Biernacki              Desempeño ->         MALO
14.=Nanny Middleditch              Desempeño ->         MALO
15.=Lisle Shalloo                  Desempeño ->         MALO
16.=Burk McAne                     Desempeño ->         MALO
17.=Susana Andrzej                 Desempeño ->         MALO
18.=Oralia Ericssen                Desempeño ->         MALO
~~~

Referencias:
------------
Hemos utilizado este generador de árboles para simular un caso real:
[https://abrandenberger.github.io/random-trees/]

Obtuvimos nombres al azar de:
[https://www.mockaroo.com/]

Nombres:
Christy Prangnell
Orsola Sancto
Nikkie Alven
Ellie Lermouth
Opalina Biernacki
Lisle Shalloo
Moise Maker
Corbett Scotney
Bartie Poe
Kittie Eldrid
Nanny Middleditch
Burk McAne
Susana Andrzej
Oralia Ericssen
Justinn Bartel
Alf Feldheim
Evonne Vigietti
Janith Mont
Claudia Ameer-Beg
Carri Lee
