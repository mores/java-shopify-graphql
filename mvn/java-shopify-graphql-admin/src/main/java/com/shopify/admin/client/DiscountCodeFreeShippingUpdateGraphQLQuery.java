package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DiscountCodeFreeShippingInput;
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
 * Updates a [free shipping discount](https://help.shopify.com/manual/discounts/discount-types/free-shipping)
 * that's applied on a cart and at checkout when a customer enters a code.
 *   
 * > Note:
 * > To update a free shipping discount that's automatically applied on a cart
 * and at checkout, use the [`discountAutomaticFreeShippingUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountAutomaticFreeShippingUpdate) mutation.
 */
public class DiscountCodeFreeShippingUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeFreeShippingUpdateGraphQLQuery(String id,
      DiscountCodeFreeShippingInput freeShippingCodeDiscount, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (freeShippingCodeDiscount != null || fieldsSet.contains("freeShippingCodeDiscount")) {
        getInput().put("freeShippingCodeDiscount", freeShippingCodeDiscount);
    }
  }

  public DiscountCodeFreeShippingUpdateGraphQLQuery(String id,
      DiscountCodeFreeShippingInput freeShippingCodeDiscount, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (freeShippingCodeDiscount != null || fieldsSet.contains("freeShippingCodeDiscount")) {
        getInput().put("freeShippingCodeDiscount", freeShippingCodeDiscount);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DiscountCodeFreeShippingUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeFreeShippingUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private DiscountCodeFreeShippingInput freeShippingCodeDiscount;

    private String queryName;

    public DiscountCodeFreeShippingUpdateGraphQLQuery build() {
      return new DiscountCodeFreeShippingUpdateGraphQLQuery(id, freeShippingCodeDiscount, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the discount code to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the discount code to update.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the discount code.
     */
    public Builder freeShippingCodeDiscount(
        DiscountCodeFreeShippingInput freeShippingCodeDiscount) {
      this.freeShippingCodeDiscount = freeShippingCodeDiscount;
      this.fieldsSet.add("freeShippingCodeDiscount");
      return this;
    }

    /**
     * The input data used to update the discount code.
     */
    public Builder freeShippingCodeDiscountReference(String variableRef) {
      this.variableReferences.put("freeShippingCodeDiscount", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("DiscountCodeFreeShippingInput"))).build());
      this.fieldsSet.add("freeShippingCodeDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
