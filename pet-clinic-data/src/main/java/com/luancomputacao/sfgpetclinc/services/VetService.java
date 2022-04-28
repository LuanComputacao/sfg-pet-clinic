package com.luancomputacao.sfgpetclinc.services;

import com.luancomputacao.sfgpetclinc.model.Owner;
import com.luancomputacao.sfgpetclinc.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
