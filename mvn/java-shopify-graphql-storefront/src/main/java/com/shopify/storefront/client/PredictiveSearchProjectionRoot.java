package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PredictiveSearchProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PredictiveSearchProjectionRoot() {
    super(null, null, java.util.Optional.of("PredictiveSearchResult"));
  }

  public PredictiveSearchProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleProjection<PredictiveSearchProjectionRoot<PARENT, ROOT>, PredictiveSearchProjectionRoot<PARENT, ROOT>> articles(
      ) {
    ArticleProjection<PredictiveSearchProjectionRoot<PARENT, ROOT>, PredictiveSearchProjectionRoot<PARENT, ROOT>> projection = new ArticleProjection<>(this, this);    
    getFields().put("articles", projection);
    return projection;
  }

  public CollectionProjection<PredictiveSearchProjectionRoot<PARENT, ROOT>, PredictiveSearchProjectionRoot<PARENT, ROOT>> collections(
      ) {
    CollectionProjection<PredictiveSearchProjectionRoot<PARENT, ROOT>, PredictiveSearchProjectionRoot<PARENT, ROOT>> projection = new CollectionProjection<>(this, this);    
    getFields().put("collections", projection);
    return projection;
  }

  public PageProjection<PredictiveSearchProjectionRoot<PARENT, ROOT>, PredictiveSearchProjectionRoot<PARENT, ROOT>> pages(
      ) {
    PageProjection<PredictiveSearchProjectionRoot<PARENT, ROOT>, PredictiveSearchProjectionRoot<PARENT, ROOT>> projection = new PageProjection<>(this, this);    
    getFields().put("pages", projection);
    return projection;
  }

  public ProductProjection<PredictiveSearchProjectionRoot<PARENT, ROOT>, PredictiveSearchProjectionRoot<PARENT, ROOT>> products(
      ) {
    ProductProjection<PredictiveSearchProjectionRoot<PARENT, ROOT>, PredictiveSearchProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("products", projection);
    return projection;
  }

  public SearchQuerySuggestionProjection<PredictiveSearchProjectionRoot<PARENT, ROOT>, PredictiveSearchProjectionRoot<PARENT, ROOT>> queries(
      ) {
    SearchQuerySuggestionProjection<PredictiveSearchProjectionRoot<PARENT, ROOT>, PredictiveSearchProjectionRoot<PARENT, ROOT>> projection = new SearchQuerySuggestionProjection<>(this, this);    
    getFields().put("queries", projection);
    return projection;
  }
}
