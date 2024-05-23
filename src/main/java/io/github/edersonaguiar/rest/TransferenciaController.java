package io.github.edersonaguiar.rest;

import io.github.edersonaguiar.model.entity.Servico;
import io.github.edersonaguiar.model.entity.TranferenciasContas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transferencias")
public class TransferenciaController {
    @Autowired
    private Servico service;

    @PostMapping
    public TranferenciasContas agendarTransferencia(@RequestBody TranferenciasContas transferencia) {
        return service.agendarTransferencia(transferencia);
    }

    @GetMapping
    public List<TranferenciasContas> listarTransferencias() {
        return service.listarTransferencias();
    }
}


