package com.luancomputacao.sfgpetclinc.services;

import com.luancomputacao.sfgpetclinc.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
