package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyLocationRoleAssign;
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
 * Assigns roles on a company location.
 */
public class CompanyLocationAssignRolesGraphQLQuery extends GraphQLQuery {
  public CompanyLocationAssignRolesGraphQLQuery(String companyLocationId,
      List<CompanyLocationRoleAssign> rolesToAssign, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (rolesToAssign != null || fieldsSet.contains("rolesToAssign")) {
        getInput().put("rolesToAssign", rolesToAssign);
    }
  }

  public CompanyLocationAssignRolesGraphQLQuery(String companyLocationId,
      List<CompanyLocationRoleAssign> rolesToAssign, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (rolesToAssign != null || fieldsSet.contains("rolesToAssign")) {
        getInput().put("rolesToAssign", rolesToAssign);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyLocationAssignRolesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationAssignRoles";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyLocationId;

    private List<CompanyLocationRoleAssign> rolesToAssign;

    private String queryName;

    public CompanyLocationAssignRolesGraphQLQuery build() {
      return new CompanyLocationAssignRolesGraphQLQuery(companyLocationId, rolesToAssign, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The location whose roles are being assigned.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The location whose roles are being assigned.
     */
    public Builder companyLocationIdReference(String variableRef) {
      this.variableReferences.put("companyLocationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The roles to assign.
     */
    public Builder rolesToAssign(List<CompanyLocationRoleAssign> rolesToAssign) {
      this.rolesToAssign = rolesToAssign;
      this.fieldsSet.add("rolesToAssign");
      return this;
    }

    /**
     * The roles to assign.
     */
    public Builder rolesToAssignReference(String variableRef) {
      this.variableReferences.put("rolesToAssign", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("CompanyLocationRoleAssign"))))).build());
      this.fieldsSet.add("rolesToAssign");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
