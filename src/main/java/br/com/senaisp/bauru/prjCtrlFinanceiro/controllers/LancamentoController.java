package br.com.senaisp.bauru.prjCtrlFinanceiro.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senaisp.bauru.prjCtrlFinanceiro.dtos.LancamentoRequest;
import br.com.senaisp.bauru.prjCtrlFinanceiro.dtos.LancamentoResponse;
import br.com.senaisp.bauru.prjCtrlFinanceiro.services.LancamentoService;

@RestController
@RequestMapping("/usuarios/{usuarioId}/lancamentos")
public class LancamentoController {
    private final LancamentoService service;
    public LancamentoController(LancamentoService service) {
        this.service = service;
    }
    @GetMapping
    public List<LancamentoResponse> listar(@PathVariable Long usuarioId) {
        return service.listar(usuarioId);
    }
    @PostMapping
    public ResponseEntity<LancamentoResponse> cadastrar(
            @PathVariable Long usuarioId, @RequestBody LancamentoRequest dados) {
        return ResponseEntity.status(201).body(service.cadastrar(usuarioId, dados));
    }
}
