package com.cevp.market.persistence.mapper;

import com.cevp.market.domain.Category;
import com.cevp.market.persistence.entity.Categoria;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
        @Mapping(source = "idCategoria", target = "categoryId"),
        @Mapping(source = "descripcion", target = "categoryDesc"),
        @Mapping(source = "estado", target = "active")
    })
    Category toCatgory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
