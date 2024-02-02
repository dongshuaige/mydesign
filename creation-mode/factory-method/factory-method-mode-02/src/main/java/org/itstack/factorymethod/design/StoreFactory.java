package org.itstack.factorymethod.design;

import org.itstack.factorymethod.design.store.ICommodity;
import org.itstack.factorymethod.design.store.impl.CardCommodityService;
import org.itstack.factorymethod.design.store.impl.CouponCommodityService;
import org.itstack.factorymethod.design.store.impl.GoodsCommodityService;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 工厂类
 */
public class StoreFactory {

    private static final Map<Integer, ICommodity> commodityServiceMap = new HashMap<>();

    static {
        commodityServiceMap.put(1, new CouponCommodityService());
        commodityServiceMap.put(2, new GoodsCommodityService());
        commodityServiceMap.put(3, new CardCommodityService());
    }

    /**
     * 工厂模式根据商品类型获取对应service(map配置结构)
     *
     * @param commodityType 商品类型
     * @return ICommodity
     */
    public ICommodity getCommodityServiceByMap(Integer commodityType) {
        return Optional.ofNullable(commodityType)
                .map(commodityServiceMap::get)
                .orElseThrow(() -> new RuntimeException("不存在的商品服务类型"));
//        if (null == commodityType) return null;
//        ICommodity iCommodity = commodityServiceMap.get(commodityType);
//        if (null == iCommodity) {
//            throw new RuntimeException("不存在的商品服务类型");
//        } else {
//            return iCommodity;
//        }
    }
    
    /**
     * 工厂模式根据商品类型获取对应service(switch判断)
     *
     * @param commodityType 商品类型
     * @return ICommodity
     */
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        switch (commodityType) {
            case 1:
                return new CouponCommodityService();
            case 2:
                return new GoodsCommodityService();
            case 3:
                return new CardCommodityService();
            default:
                throw new RuntimeException("不存在的商品服务类型");
        }
    }
}
