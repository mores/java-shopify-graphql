package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Activates and deactivates delivery customizations.
 */
public class DeliveryCustomizationActivationGraphQLQuery extends GraphQLQuery {
  public DeliveryCustomizationActivationGraphQLQuery(List<String> ids, boolean enabled,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }getInput().put("enabled", enabled);                   
  }

  public DeliveryCustomizationActivationGraphQLQuery(List<String> ids, boolean enabled,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }getInput().put("enabled", enabled);                   
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DeliveryCustomizationActivationGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryCustomizationActivation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> ids;

    private boolean enabled;

    private String queryName;

    public DeliveryCustomizationActivationGraphQLQuery build() {
      return new DeliveryCustomizationActivationGraphQLQuery(ids, enabled, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The global IDs of the delivery customizations.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * The global IDs of the delivery customizations.
     */
    public Builder idsReference(String variableRef) {
      this.variableReferences.put("ids", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * The enabled status of the delivery customizations.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      this.fieldsSet.add("enabled");
      return this;
    }

    /**
     * The enabled status of the delivery customizations.
     */
    public Builder enabledReference(String variableRef) {
      this.variableReferences.put("enabled", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Boolean"))).build());
      this.fieldsSet.add("enabled");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
