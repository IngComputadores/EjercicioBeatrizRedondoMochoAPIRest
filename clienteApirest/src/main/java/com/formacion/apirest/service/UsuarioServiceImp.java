package com.formacion.apirest.service;


import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacion.apirest.entity.Usuario;
import com.formacion.apirest.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UserDetailsService{

	private Logger logger = LoggerFactory.getLogger(UsuarioServiceImp.class);
	
	
	@Autowired
	private UsuarioRepository usuarioRepositorio;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario= usuarioRepositorio.findByUsername(username);
		if(usuario==null) {
			logger.error("Error en el login: el ususario "+username+ "no exite");
			throw new UsernameNotFoundException("El usuario no exite en la base de datos");
		}
		
		List<GrantedAuthority> authorities = usuario.getRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				 .peek(authority->logger.info("Rol: "+authority.getAuthority()))
				.collect(Collectors.toList());
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.isEnabled(), true, true, true, authorities);
	}

}
