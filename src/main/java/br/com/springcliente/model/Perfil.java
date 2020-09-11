package br.com.springcliente.model;

import br.com.springcliente.enums.RoleName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Perfil extends AbstractEntity {

    @NotNull
    @Enumerated(EnumType.STRING)
    private RoleName nome;

    @ManyToMany(mappedBy = "perfils", fetch = FetchType.LAZY)
    private List<Usuario> usuarios;

    public RoleName getNome() {
        return nome;
    }

    public void setNome(RoleName nome) {
        this.nome = nome;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
