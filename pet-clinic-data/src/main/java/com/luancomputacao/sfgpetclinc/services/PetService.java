package com.luancomputacao.sfgpetclinc.services;

import com.luancomputacao.sfgpetclinc.model.Owner;
import com.luancomputacao.sfgpetclinc.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
