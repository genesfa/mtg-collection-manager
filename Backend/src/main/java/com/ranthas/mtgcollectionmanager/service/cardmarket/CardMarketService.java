package com.ranthas.mtgcollectionmanager.service.cardmarket;

import com.ranthas.mtgcollectionmanager.dto.cardmarket.product.ProductResponse;
import com.ranthas.mtgcollectionmanager.dto.cardmarket.wants_list.WantsList;

import java.util.List;

public interface CardMarketService {

    ProductResponse findProductById(int id);

    List<WantsList> findAllWantsLists();

    WantsList findWantsListById(int id);

    WantsList createWantsList(String name);

    WantsList addCardToWantsList(int wantsListId, int productId);

    WantsList removeCardFromWantsList(int wantsListId, String wantsId);
}
