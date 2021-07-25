package com.team24.hackaibm.model.enums;

import java.io.Serializable;

public enum ProductCategory implements Serializable {
    PLÁSTICOS,
    QUÍMICOS,
    VIDROS,
    METAIS,
    TECIDO,
    MADEIRA,
    ELETRÔNICOS,
    BORRACHA;

    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
/*
CATEGORY
Plástico
Químicos
Vidro
Metais
Tecido
Madeira
Eletrônico
Borracha
 */