package com.ranthas.mtgcollectionmanager.service.cardmarket;

import com.ranthas.mtgcollectionmanager.constant.Constant;
import com.ranthas.mtgcollectionmanager.dto.cardmarket.product.ProductResponse;
import com.ranthas.mtgcollectionmanager.dto.cardmarket.product.ProductResponseWrapper;
import com.ranthas.mtgcollectionmanager.dto.cardmarket.wants_list.*;
import com.ranthas.mtgcollectionmanager.repository.cardmarket.CardMarketApiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardMarketServiceImpl implements CardMarketService {

    private final CardMarketApiService cardMarketApiService;

    public CardMarketServiceImpl(CardMarketApiService cardMarketApiService) {
        this.cardMarketApiService = cardMarketApiService;
    }

    @Override
    public ProductResponse findProductById(int id) {
        return cardMarketApiService
                .sendGetRequest(Constant.PRODUCTS + "/" + id, ProductResponseWrapper.class)
                .getProduct();
    }

    @Override
    public List<WantsList> findAllWantsLists() {
        return cardMarketApiService
                .sendGetRequest(Constant.WANTS_LIST, WantsListWrapper.class)
                .getWantsLists();
    }

    @Override
    public WantsList findWantsListById(int id) {
        return cardMarketApiService
                .sendGetRequest(Constant.WANTS_LIST + "/" + id, WantsListWrapper.class)
                .getWantsList();
    }

    @Override
    public WantsList createWantsList(String name) {

        WantsListRequest data = new WantsListRequest(name);
        WantsListRequestWrapper request = new WantsListRequestWrapper(data);

        return cardMarketApiService
                .sendPostRequest(Constant.WANTS_LIST, request, WantsListWrapper.class)
                .getWantsList();
    }

    @Override
    public WantsList addCardToWantsList(int wantsListId, int productId) {

        WantsListAddItemRequest data = new WantsListAddItemRequest(productId);
        WantsListAddItemRequestWrapper request = new WantsListAddItemRequestWrapper(data);

        return cardMarketApiService
                .sendPutRequest(Constant.WANTS_LIST + "/" + wantsListId, request, WantsListWrapper.class)
                .getWantsList();
    }

    @Override
    public WantsList removeCardFromWantsList(int wantsListId, String wantsId) {

        WantsListRemoveItemRequest data = new WantsListRemoveItemRequest(wantsId);
        WantsListRemoveItemRequestWrapper request = new WantsListRemoveItemRequestWrapper(data);

        return cardMarketApiService
                .sendPutRequest(Constant.WANTS_LIST + "/" + wantsListId, request, WantsListWrapper.class)
                .getWantsList();
    }
}
