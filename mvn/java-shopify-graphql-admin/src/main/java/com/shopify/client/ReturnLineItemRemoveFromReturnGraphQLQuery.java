package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ReturnLineItemRemoveFromReturnInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ReturnLineItemRemoveFromReturnGraphQLQuery extends GraphQLQuery {
  public ReturnLineItemRemoveFromReturnGraphQLQuery(String returnId,
      List<ReturnLineItemRemoveFromReturnInput> returnLineItems, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (returnId != null || fieldsSet.contains("returnId")) {
        getInput().put("returnId", returnId);
    }if (returnLineItems != null || fieldsSet.contains("returnLineItems")) {
        getInput().put("returnLineItems", returnLineItems);
    }
  }

  public ReturnLineItemRemoveFromReturnGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnLineItemRemoveFromReturn";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String returnId;

    private List<ReturnLineItemRemoveFromReturnInput> returnLineItems;

    private String queryName;

    public ReturnLineItemRemoveFromReturnGraphQLQuery build() {
      return new ReturnLineItemRemoveFromReturnGraphQLQuery(returnId, returnLineItems, queryName, fieldsSet);
               
    }

    
    public Builder returnId(String returnId) {
      this.returnId = returnId;
      this.fieldsSet.add("returnId");
      return this;
    }

    
    public Builder returnLineItems(List<ReturnLineItemRemoveFromReturnInput> returnLineItems) {
      this.returnLineItems = returnLineItems;
      this.fieldsSet.add("returnLineItems");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
