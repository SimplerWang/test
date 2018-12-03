import com.alibaba.fastjson.JSON;
import com.newretail.order.model.req.orderrequisition.AddGoodsReq;
import com.newretail.order.model.req.orderrequisition.StoreRequisitionDetailSaveReq;
import com.newretail.order.model.req.orderrequisition.StoreRequisitionSaveReq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //test001();
        AddGoodsReq req = new AddGoodsReq();
        req.setStoreNo("W003");
        req.setDcNo("W001");
        List<AddGoodsReq.GoodsInfo> goodsInfos = new ArrayList<AddGoodsReq.GoodsInfo>();
        for (int i = 0 ;i<5;i++){
            AddGoodsReq.GoodsInfo goodsInfo = req.new GoodsInfo();
            goodsInfo.setGoodsNo("0300048");
            goodsInfo.setQty(BigDecimal.TEN);
            goodsInfos.add(goodsInfo);
        }
        req.setGoodsList(goodsInfos);
        System.out.printf(JSON.toJSONString(req));
    }

    private static void test001() {
        StoreRequisitionSaveReq req = new StoreRequisitionSaveReq();
        req.setStoreNo("W003");
        req.setDcNo("W001");
        req.setRugent(0);
        req.setRemark("remark");
        List<StoreRequisitionDetailSaveReq> detailSaveReqs = new ArrayList<StoreRequisitionDetailSaveReq>();
        for (int i = 0 ;i<5;i++){
            StoreRequisitionDetailSaveReq detailSaveReq = new StoreRequisitionDetailSaveReq();
            detailSaveReq.setGoodsId(2904472);
            detailSaveReq.setVendorId(137);
            detailSaveReq.setQty(BigDecimal.TEN);
            detailSaveReqs.add(detailSaveReq);
        }
        req.setDetails(detailSaveReqs);
        System.out.printf(JSON.toJSONString(req));
    }
}
