package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ExchangeLineItemRemoveFromReturnInput;
import com.shopify.admin.types.ReturnLineItemRemoveFromReturnInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Removes return and/or exchange lines from a return.
 */
public class RemoveFromReturnGraphQLQuery extends GraphQLQuery {
  public RemoveFromReturnGraphQLQuery(String returnId,
      List<ReturnLineItemRemoveFromReturnInput> returnLineItems,
      List<ExchangeLineItemRemoveFromReturnInput> exchangeLineItems, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (returnId != null || fieldsSet.contains("returnId")) {
        getInput().put("returnId", returnId);
    }if (returnLineItems != null || fieldsSet.contains("returnLineItems")) {
        getInput().put("returnLineItems", returnLineItems);
    }if (exchangeLineItems != null || fieldsSet.contains("exchangeLineItems")) {
        getInput().put("exchangeLineItems", exchangeLineItems);
    }
  }

  public RemoveFromReturnGraphQLQuery(String returnId,
      List<ReturnLineItemRemoveFromReturnInput> returnLineItems,
      List<ExchangeLineItemRemoveFromReturnInput> exchangeLineItems, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (returnId != null || fieldsSet.contains("returnId")) {
        getInput().put("returnId", returnId);
    }if (returnLineItems != null || fieldsSet.contains("returnLineItems")) {
        getInput().put("returnLineItems", returnLineItems);
    }if (exchangeLineItems != null || fieldsSet.contains("exchangeLineItems")) {
        getInput().put("exchangeLineItems", exchangeLineItems);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public RemoveFromReturnGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "removeFromReturn";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String returnId;

    private List<ReturnLineItemRemoveFromReturnInput> returnLineItems;

    private List<ExchangeLineItemRemoveFromReturnInput> exchangeLineItems;

    private String queryName;

    public RemoveFromReturnGraphQLQuery build() {
      return new RemoveFromReturnGraphQLQuery(returnId, returnLineItems, exchangeLineItems, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the return for line item removal.
     */
    public Builder returnId(String returnId) {
      this.returnId = returnId;
      this.fieldsSet.add("returnId");
      return this;
    }

    /**
     * The ID of the return for line item removal.
     */
    public Builder returnIdReference(String variableRef) {
      this.variableReferences.put("returnId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("returnId");
      return this;
    }

    /**
     * The return line items to remove from the return.
     */
    public Builder returnLineItems(List<ReturnLineItemRemoveFromReturnInput> returnLineItems) {
      this.returnLineItems = returnLineItems;
      this.fieldsSet.add("returnLineItems");
      return this;
    }

    /**
     * The return line items to remove from the return.
     */
    public Builder returnLineItemsReference(String variableRef) {
      this.variableReferences.put("returnLineItems", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ReturnLineItemRemoveFromReturnInput")))).build());
      this.fieldsSet.add("returnLineItems");
      return this;
    }

    /**
     * The exchange line items to remove from the return.
     */
    public Builder exchangeLineItems(
        List<ExchangeLineItemRemoveFromReturnInput> exchangeLineItems) {
      this.exchangeLineItems = exchangeLineItems;
      this.fieldsSet.add("exchangeLineItems");
      return this;
    }

    /**
     * The exchange line items to remove from the return.
     */
    public Builder exchangeLineItemsReference(String variableRef) {
      this.variableReferences.put("exchangeLineItems", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ExchangeLineItemRemoveFromReturnInput")))).build());
      this.fieldsSet.add("exchangeLineItems");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
