package com.example.demo;

import com.example.demo.enums.NivelDeAcesso;
import com.example.demo.enums.Sexo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nome;
    String sobrenome;
    Integer idade;
    String email;
    String dataDeNascimento;
    Sexo sexo;
    String cpf;
    String ddd;
    String telefone;
    NivelDeAcesso nivelDeAcesso; 
}
