package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentOrderHoldInput;
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
 * Applies a fulfillment hold on a fulfillment order.
 *   
 * As of the
 * [2025-01 API version](https://shopify.dev/changelog/apply-multiple-holds-to-a-single-fulfillment-order),
 * the mutation can be successfully executed on fulfillment orders that are already on hold.
 * To place multiple holds on a fulfillment order, apps need to supply the
 * [handle](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentHold#field-handle)
 * field. Each app can place up to
 * 10 active holds
 * per fulfillment order. If an app attempts to place more than this, the mutation will return
 * [a user error indicating that the limit has been reached](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderHoldUserErrorCode#value-fulfillmentorderholdlimitreached).
 * The app would need to release one of its existing holds before being able to apply a new one.
 */
public class FulfillmentOrderHoldGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderHoldGraphQLQuery(String id, FulfillmentOrderHoldInput fulfillmentHold,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (fulfillmentHold != null || fieldsSet.contains("fulfillmentHold")) {
        getInput().put("fulfillmentHold", fulfillmentHold);
    }
  }

  public FulfillmentOrderHoldGraphQLQuery(String id, FulfillmentOrderHoldInput fulfillmentHold,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (fulfillmentHold != null || fieldsSet.contains("fulfillmentHold")) {
        getInput().put("fulfillmentHold", fulfillmentHold);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FulfillmentOrderHoldGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderHold";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private FulfillmentOrderHoldInput fulfillmentHold;

    private String queryName;

    public FulfillmentOrderHoldGraphQLQuery build() {
      return new FulfillmentOrderHoldGraphQLQuery(id, fulfillmentHold, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the fulfillment order on which a fulfillment hold is applied.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the fulfillment order on which a fulfillment hold is applied.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The details of the fulfillment hold applied on the fulfillment order.
     */
    public Builder fulfillmentHold(FulfillmentOrderHoldInput fulfillmentHold) {
      this.fulfillmentHold = fulfillmentHold;
      this.fieldsSet.add("fulfillmentHold");
      return this;
    }

    /**
     * The details of the fulfillment hold applied on the fulfillment order.
     */
    public Builder fulfillmentHoldReference(String variableRef) {
      this.variableReferences.put("fulfillmentHold", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("FulfillmentOrderHoldInput"))).build());
      this.fieldsSet.add("fulfillmentHold");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
