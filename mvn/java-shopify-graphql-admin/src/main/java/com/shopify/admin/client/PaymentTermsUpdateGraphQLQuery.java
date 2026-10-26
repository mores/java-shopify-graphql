package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PaymentTermsUpdateInput;
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
 * Update payment terms on an order. To update payment terms on a draft order,
 * use a draft order mutation and include the request with the `DraftOrderInput`.
 */
public class PaymentTermsUpdateGraphQLQuery extends GraphQLQuery {
  public PaymentTermsUpdateGraphQLQuery(PaymentTermsUpdateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PaymentTermsUpdateGraphQLQuery(PaymentTermsUpdateInput input, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PaymentTermsUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentTermsUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private PaymentTermsUpdateInput input;

    private String queryName;

    public PaymentTermsUpdateGraphQLQuery build() {
      return new PaymentTermsUpdateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields used to update the payment terms.
     */
    public Builder input(PaymentTermsUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields used to update the payment terms.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("PaymentTermsUpdateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
