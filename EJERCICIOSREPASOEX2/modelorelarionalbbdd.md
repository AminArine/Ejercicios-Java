*Voy a introduir un codigo mermeid para probar*

```mermeid
erDiagram

    PROFESOR {
        string DNI PK
        string Nombre
        string Direccion
        string Telefono
    }

    MODULO {
        string Codigo PK
        string Nombre
        string DNI_Profesor FK
    }

    ALUMNO {
        string N_expdte PK
        string Nombre
        string Apellidos
        date Fecha_nac
        string Curso_Grupo FK
        string Letra_Grupo FK
    }

    GRUPO {
        string Curso PK
        string Letra PK
        string Aula
        string N_expdte_Delegado FK
    }

    MATRICULA {
        string Codigo_Modulo PK, FK
        string N_expdte PK, FK
    }

    PROFESOR ||--|{ MODULO : Imparte
    MODULO ||--|{ MATRICULA : Tiene
    ALUMNO ||--|{ MATRICULA : Realiza
    GRUPO ||--|{ ALUMNO : Pertenece
    ALUMNO o|--|| GRUPO : Delega

    ```
