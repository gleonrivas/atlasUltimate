package com.app.atlasultimate.registro;

import com.app.atlasultimate.model.Cliente;
import com.app.atlasultimate.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicioImpl implements ClienteServicio{

    private ClienteRepository clienteRepository;

    public ClienteServicioImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente GuardarCliente(ClienteRegistroDTO registroDTO) {
        Cliente cliente = new Cliente(registroDTO.getId(), registroDTO.getNombre(), registroDTO.getApellidos(), registroDTO.getDni(),registroDTO.getContrasena(),registroDTO.getTelefono(),registroDTO.getEmail());
        return clienteRepository.save(cliente);
    }
}