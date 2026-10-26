package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PaymentTermsType;
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
 * The list of payment terms templates eligible for all shops and users.
 */
public class PaymentTermsTemplatesGraphQLQuery extends GraphQLQuery {
  public PaymentTermsTemplatesGraphQLQuery(PaymentTermsType paymentTermsType, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (paymentTermsType != null || fieldsSet.contains("paymentTermsType")) {
        getInput().put("paymentTermsType", paymentTermsType);
    }
  }

  public PaymentTermsTemplatesGraphQLQuery(PaymentTermsType paymentTermsType, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (paymentTermsType != null || fieldsSet.contains("paymentTermsType")) {
        getInput().put("paymentTermsType", paymentTermsType);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PaymentTermsTemplatesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "paymentTermsTemplates";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private PaymentTermsType paymentTermsType;

    private String queryName;

    public PaymentTermsTemplatesGraphQLQuery build() {
      return new PaymentTermsTemplatesGraphQLQuery(paymentTermsType, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The payment terms type to filter the payment terms templates list.
     */
    public Builder paymentTermsType(PaymentTermsType paymentTermsType) {
      this.paymentTermsType = paymentTermsType;
      this.fieldsSet.add("paymentTermsType");
      return this;
    }

    /**
     * The payment terms type to filter the payment terms templates list.
     */
    public Builder paymentTermsTypeReference(String variableRef) {
      this.variableReferences.put("paymentTermsType", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("PaymentTermsType")).build());
      this.fieldsSet.add("paymentTermsType");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
