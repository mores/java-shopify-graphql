package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OptionReorderInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ProductOptionsReorderGraphQLQuery extends GraphQLQuery {
  public ProductOptionsReorderGraphQLQuery(String productId, List<OptionReorderInput> options,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (options != null || fieldsSet.contains("options")) {
        getInput().put("options", options);
    }
  }

  public ProductOptionsReorderGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productOptionsReorder";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<OptionReorderInput> options;

    private String queryName;

    public ProductOptionsReorderGraphQLQuery build() {
      return new ProductOptionsReorderGraphQLQuery(productId, options, queryName, fieldsSet);
               
    }

    
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    
    public Builder options(List<OptionReorderInput> options) {
      this.options = options;
      this.fieldsSet.add("options");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
