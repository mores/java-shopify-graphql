package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MoveInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ProductReorderMediaGraphQLQuery extends GraphQLQuery {
  public ProductReorderMediaGraphQLQuery(String id, List<MoveInput> moves, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (moves != null || fieldsSet.contains("moves")) {
        getInput().put("moves", moves);
    }
  }

  public ProductReorderMediaGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productReorderMedia";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<MoveInput> moves;

    private String queryName;

    public ProductReorderMediaGraphQLQuery build() {
      return new ProductReorderMediaGraphQLQuery(id, moves, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder moves(List<MoveInput> moves) {
      this.moves = moves;
      this.fieldsSet.add("moves");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
