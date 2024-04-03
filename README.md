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


Resultados obtenidos:
------------

~~~Output
C:\Users\marcelo\.jdks\corretto-17.0.10\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=65220:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\marcelo\Documents\java\examen_de_entrada\target\classes;C:\Users\marcelo\.m2\repository\org\springframework\boot\spring-boot-starter\3.2.4\spring-boot-starter-3.2.4.jar;C:\Users\marcelo\.m2\repository\org\springframework\boot\spring-boot\3.2.4\spring-boot-3.2.4.jar;C:\Users\marcelo\.m2\repository\org\springframework\spring-context\6.1.5\spring-context-6.1.5.jar;C:\Users\marcelo\.m2\repository\org\springframework\spring-aop\6.1.5\spring-aop-6.1.5.jar;C:\Users\marcelo\.m2\repository\org\springframework\spring-beans\6.1.5\spring-beans-6.1.5.jar;C:\Users\marcelo\.m2\repository\org\springframework\spring-expression\6.1.5\spring-expression-6.1.5.jar;C:\Users\marcelo\.m2\repository\io\micrometer\micrometer-observation\1.12.4\micrometer-observation-1.12.4.jar;C:\Users\marcelo\.m2\repository\io\micrometer\micrometer-commons\1.12.4\micrometer-commons-1.12.4.jar;C:\Users\marcelo\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.2.4\spring-boot-autoconfigure-3.2.4.jar;C:\Users\marcelo\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.2.4\spring-boot-starter-logging-3.2.4.jar;C:\Users\marcelo\.m2\repository\ch\qos\logback\logback-classic\1.4.14\logback-classic-1.4.14.jar;C:\Users\marcelo\.m2\repository\ch\qos\logback\logback-core\1.4.14\logback-core-1.4.14.jar;C:\Users\marcelo\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.21.1\log4j-to-slf4j-2.21.1.jar;C:\Users\marcelo\.m2\repository\org\apache\logging\log4j\log4j-api\2.21.1\log4j-api-2.21.1.jar;C:\Users\marcelo\.m2\repository\org\slf4j\jul-to-slf4j\2.0.12\jul-to-slf4j-2.0.12.jar;C:\Users\marcelo\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\marcelo\.m2\repository\org\springframework\spring-core\6.1.5\spring-core-6.1.5.jar;C:\Users\marcelo\.m2\repository\org\springframework\spring-jcl\6.1.5\spring-jcl-6.1.5.jar;C:\Users\marcelo\.m2\repository\org\yaml\snakeyaml\2.2\snakeyaml-2.2.jar;C:\Users\marcelo\.m2\repository\org\projectlombok\lombok\1.18.30\lombok-1.18.30.jar;C:\Users\marcelo\.m2\repository\org\slf4j\slf4j-api\2.0.12\slf4j-api-2.0.12.jar marcial.ascencio.vilca.examen_de_entrada.App
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
