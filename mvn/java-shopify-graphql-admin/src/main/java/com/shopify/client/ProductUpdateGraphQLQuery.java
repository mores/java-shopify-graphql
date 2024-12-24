package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CreateMediaInput;
import com.shopify.types.ProductUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ProductUpdateGraphQLQuery extends GraphQLQuery {
  public ProductUpdateGraphQLQuery(ProductUpdateInput product, List<CreateMediaInput> media,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (product != null || fieldsSet.contains("product")) {
        getInput().put("product", product);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
  }

  public ProductUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductUpdateInput product;

    private List<CreateMediaInput> media;

    private String queryName;

    public ProductUpdateGraphQLQuery build() {
      return new ProductUpdateGraphQLQuery(product, media, queryName, fieldsSet);
               
    }

    
    public Builder product(ProductUpdateInput product) {
      this.product = product;
      this.fieldsSet.add("product");
      return this;
    }

    
    public Builder media(List<CreateMediaInput> media) {
      this.media = media;
      this.fieldsSet.add("media");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
