package com.Probyecto1.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //para los metodos getters,setters
@AllArgsConstructor
@NoArgsConstructor
@Entity // el mapeo de la base de datos
@Table(
        name = "tablas_libros" //nombre con el que se mapea la base de datos
)
public class Libro {

    @Id //identificador unico
    @GeneratedValue(strategy = GenerationType.IDENTITY)//especifica como se generan los valores de las llaves primarias
    private  Long idLibro;
    private String titulo;
    private String autor;
    private  String genero;
    private  Float  año;

}
