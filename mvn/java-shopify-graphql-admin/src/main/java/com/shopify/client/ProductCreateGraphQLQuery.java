package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CreateMediaInput;
import com.shopify.types.ProductCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ProductCreateGraphQLQuery extends GraphQLQuery {
  public ProductCreateGraphQLQuery(ProductCreateInput product, List<CreateMediaInput> media,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (product != null || fieldsSet.contains("product")) {
        getInput().put("product", product);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
  }

  public ProductCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductCreateInput product;

    private List<CreateMediaInput> media;

    private String queryName;

    public ProductCreateGraphQLQuery build() {
      return new ProductCreateGraphQLQuery(product, media, queryName, fieldsSet);
               
    }

    
    public Builder product(ProductCreateInput product) {
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
