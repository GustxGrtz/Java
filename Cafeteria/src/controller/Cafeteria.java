package controller;

import java.util.ArrayList;
import java.util.List;

import models.Insumo.*;
import models.Pessoa.*;
import models.Produto.*;
import models.Venda.*;

public class Cafeteria {
    List<Produto> produtos;
    int codigoProduto;

    List<Insumo> insumos;
    int codigoInsumo = 0;

    List<Pessoa> pessoas;
    int codigoPessoa = 0;

    List<Venda> vendas;
    int codigoVendas = 0;

    public Cafeteria() {
        produtos = new ArrayList<>();
        insumos = new ArrayList<>();
        pessoas = new ArrayList<>();
        vendas = new ArrayList<>();
    }

////// ------------ PRODUTO ------------ //////

    //////// ADICIONAR PRODUTO ////////
    public void AdicionarProduto(Produto novoProduto) {
        int novoCodigo = codigoProduto + 1;

        if (BuscarProduto(novoProduto.getCodigoProduto()) == null) {
            novoProduto.setCodigoProduto(novoCodigo);
            codigoProduto = novoCodigo;
            produtos.add(novoProduto);
            System.out.println(novoProduto.getNomeProduto() + ", com código: " + novoProduto.getCodigoProduto()
                    + " cadastrado com sucesso!");
        } else {
            System.out.println("Produto já cadastrado com esse id! (" + novoProduto.getCodigoProduto() + ")");
        }
    }

    //////// LISTAR PRODUTO ////////
    public void ListarProdutos() {
        if (produtos.size() == 0) {
            System.out.println("Não há produtos cadastradas!");
        } else {
            System.out.println(produtos);
        }
    }

    //////// REMOVER PRODUTO ////////
    public void RemoverProduto(Produto removerProduto) {
        if (BuscarProduto(removerProduto.getCodigoProduto()) != null) {
            produtos.remove(removerProduto);
            System.out.println(removerProduto.getNomeProduto() + ", com código: " + removerProduto.getCodigoProduto()
                    + " removido com sucesso!");
        } else {
            System.out.println("Produto não encontrada!");
        }
    }

    //////// BUSCAR PRODUTO ////////
    public Produto BuscarProduto(int idProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigoProduto() == idProduto) {
                return produto;
            }
        }
        return null;
    }

////// ------------ INSUMO ------------ //////

////// ADICIONAR INSUMO ////////

public void AdicionarInsumo(Insumo novoInsumo) {
    int novoCodigo = codigoInsumo + 1;

    if (BuscarInsumo(novoInsumo.getCodigoInsumo()) == null) {
        novoInsumo.setCodigoInsumo(novoCodigo);
        codigoInsumo = novoCodigo;
        insumos.add(novoInsumo);
        System.out.println(novoInsumo.getNomeInsumo() + ", com código: " + novoInsumo.getCodigoInsumo()
                + " cadastrado com sucesso!");
    } else {
        System.out.println("Insumo já cadastrado com esse id! (" + novoInsumo.getCodigoInsumo() + ")");
    }
}

////// LISTAR INSUMO ////////

public void ListarInsumos() {
    if (insumos.size() == 0) {
        System.out.println("Não há insumos cadastrados!");
    } else {
        System.out.println(insumos);
    }
}

////// REMOVER INSUMO ////////

public void RemoverInsumo(Insumo removerInsumo) {
    if (BuscarInsumo(removerInsumo.getCodigoInsumo()) != null) {
        insumos.remove(removerInsumo);
        System.out.println(removerInsumo.getNomeInsumo() + ", com código: " + removerInsumo.getCodigoInsumo()
                + " removido com sucesso!");
    } else {
        System.out.println("Insumo não encontrado!");
    }
}

////// BUSCAR INSUMO ////////

public Insumo BuscarInsumo(int idInsumo) {
    for (Insumo insumo : insumos) {
        if (insumo.getCodigoInsumo() == idInsumo) {
            return insumo;
        }
    }
    return null;
}




////// ------------ PESSOA ------------ //////

////// ------------ VENDA ------------ //////

    //////// ADICIONAR VENDA ////////
    public List<Venda> adicionarVenda(Venda novaVenda) throws Exception {
        int novoCodigo = codigoVendas + 1;
    
        if (BuscarVenda(novaVenda.getIdVenda()) == null) {
            novaVenda.setIdVenda(novoCodigo);
            codigoVendas = novoCodigo;
            vendas.add(novaVenda);
        } else {
            throw new Exception("Venda já cadastrada (" + novaVenda.getIdVenda() + ")");
        }
        return vendas;
    }

    //////// LISTAR VENDA ////////
    public List<Venda> listarVendas() throws Exception {
        if (vendas.isEmpty()) {
            throw new Exception("Não há vendas registradas.");
        }
        return vendas;
    }

    //////// REMOVER VENDA ////////
    public List<Venda> RemoverVenda(Venda removerVenda) throws Exception{
            if (BuscarVenda(removerVenda.getIdVenda()) != null) {
                vendas.remove(removerVenda);
            } else {
                throw new Exception("A venda com o ID " + removerVenda.getIdVenda() + " não foi encontrada.");
            }
            return vendas;
        }


    //////// BUSCAR VENDA ////////
    public List<Venda> BuscarVenda(int idVenda) throws Exception{
        for (Venda venda: vendas) {
            if (venda.getIdVenda() == idVenda) {
                return vendas;
        }
    }
    throw new Exception("Venda não encontrada para o ID: " + idVenda);
    }
}