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
 * Revokes roles on a company location.
 */
public class CompanyLocationRevokeRolesGraphQLQuery extends GraphQLQuery {
  public CompanyLocationRevokeRolesGraphQLQuery(String companyLocationId,
      List<String> rolesToRevoke, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (rolesToRevoke != null || fieldsSet.contains("rolesToRevoke")) {
        getInput().put("rolesToRevoke", rolesToRevoke);
    }
  }

  public CompanyLocationRevokeRolesGraphQLQuery(String companyLocationId,
      List<String> rolesToRevoke, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (rolesToRevoke != null || fieldsSet.contains("rolesToRevoke")) {
        getInput().put("rolesToRevoke", rolesToRevoke);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyLocationRevokeRolesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationRevokeRoles";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyLocationId;

    private List<String> rolesToRevoke;

    private String queryName;

    public CompanyLocationRevokeRolesGraphQLQuery build() {
      return new CompanyLocationRevokeRolesGraphQLQuery(companyLocationId, rolesToRevoke, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The location whose roles are being revoked.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The location whose roles are being revoked.
     */
    public Builder companyLocationIdReference(String variableRef) {
      this.variableReferences.put("companyLocationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The current roles to revoke.
     */
    public Builder rolesToRevoke(List<String> rolesToRevoke) {
      this.rolesToRevoke = rolesToRevoke;
      this.fieldsSet.add("rolesToRevoke");
      return this;
    }

    /**
     * The current roles to revoke.
     */
    public Builder rolesToRevokeReference(String variableRef) {
      this.variableReferences.put("rolesToRevoke", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("rolesToRevoke");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
