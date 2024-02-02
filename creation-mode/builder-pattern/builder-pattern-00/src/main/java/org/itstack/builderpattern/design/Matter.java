package org.itstack.builderpattern.design;

import java.math.BigDecimal;

/**
 * 装修物料
 */
public interface Matter {
    /**
     * 场景: 地板、地砖、涂料、吊顶
     * @return scene
     */
    String scene();
    
    /**
     * 品牌
     * @return brand
     */
    String brand();

    /**
     * 型号
     * @return model
     */
    String model();

    /**
     * 平米报价
     * @return price
     */
    BigDecimal price();

    /**
     * 描述
     * @return desc
     */
    String desc();
}
