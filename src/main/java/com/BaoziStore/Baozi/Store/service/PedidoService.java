package com.BaoziStore.Baozi.Store.service;

import com.BaoziStore.Baozi.Store.model.Cliente;
import com.BaoziStore.Baozi.Store.model.Pedido;
import com.BaoziStore.Baozi.Store.model.Produto;
import com.BaoziStore.Baozi.Store.repository.ClienteRepository;
import com.BaoziStore.Baozi.Store.repository.PedidoRepository;
import com.BaoziStore.Baozi.Store.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public Pedido criarPedido(Pedido pedido) {

        Cliente cliente = clienteRepository.findById(pedido.getCliente().getId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));

        Produto produto = produtoRepository.findById(pedido.getProduto().getId())
                .orElseThrow(() -> new RuntimeException("Produto não encontrado!"));

        pedido.setCliente(cliente);
        pedido.setProduto(produto);
        pedido.setQuantidade(pedido.getQuantidade());

        return pedidoRepository.save(pedido);
    }

    public Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado!"));

    }

    public List<Pedido> buscarTodosPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido atualizar(Long id, Pedido pedidoAtualizado) {
        Pedido pedido = pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        Cliente cliente = clienteRepository.findById(pedidoAtualizado.getCliente().getId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        Produto produto = produtoRepository.findById(pedidoAtualizado.getProduto().getId())
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        pedido.setCliente(cliente);
        pedido.setProduto(produto);
        pedido.setQuantidade(pedidoAtualizado.getQuantidade());

        return pedidoRepository.save(pedido);
    }

    public void remover(Long id) {
        pedidoRepository.deleteById(id);
    }
}
