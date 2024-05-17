package models.Venda;

import java.time.LocalDateTime;

import models.Insumo.Insumo;
import models.Pessoa.Funcionario;
import models.Pessoa.Usuario;
import models.Produto.Produto;

public class Venda {
    private Produto produto;
    private Insumo insumo;
    private Funcionario funcionario;
    private Usuario usuario;
    private LocalDateTime dataVenda;
    private int idVenda;

    public Venda(Produto produto, Insumo insumo, Funcionario funcionario, Usuario usuario, LocalDateTime dataVenda) {
        this.produto = produto;
        this.insumo = insumo;
        this.funcionario = funcionario;
        this.usuario = usuario;
        this.dataVenda = dataVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    @Override
    public String toString() {
        return "Venda [produto=" + produto + ", insumo=" + insumo + ", funcionario=" + funcionario + ", usuario="
                + usuario + ", dataVenda=" + dataVenda + ", idVenda=" + idVenda + "]";
    }
}
