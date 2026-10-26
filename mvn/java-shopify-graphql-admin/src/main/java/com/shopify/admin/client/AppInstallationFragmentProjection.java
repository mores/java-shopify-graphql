package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.AppRevenueAttributionRecordSortKeys;
import com.shopify.admin.types.AppSubscriptionSortKeys;
import com.shopify.admin.types.AppTransactionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class AppInstallationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppInstallationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppInstallation"));
  }

  public AppInstallationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> accessScopes(
      ) {
     AccessScopeProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AccessScopeProjection<>(this, getRoot());
     getFields().put("accessScopes", projection);
     return projection;
  }

  public AppSubscriptionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> activeSubscriptions(
      ) {
     AppSubscriptionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionProjection<>(this, getRoot());
     getFields().put("activeSubscriptions", projection);
     return projection;
  }

  public AppSubscriptionConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> allSubscriptions(
      ) {
     AppSubscriptionConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionConnectionProjection<>(this, getRoot());
     getFields().put("allSubscriptions", projection);
     return projection;
  }

  public AppSubscriptionConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> allSubscriptions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppSubscriptionSortKeys sortKey) {
    AppSubscriptionConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionConnectionProjection<>(this, getRoot());    
    getFields().put("allSubscriptions", projection);
    getInputArguments().computeIfAbsent("allSubscriptions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("allSubscriptions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("allSubscriptions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("allSubscriptions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("allSubscriptions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("allSubscriptions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("allSubscriptions").add(sortKeyArg);
    return projection;
  }

  public AppSubscriptionConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> allSubscriptionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    AppSubscriptionConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionConnectionProjection<>(this, getRoot());    
    getFields().put("allSubscriptions", projection);
    getInputArguments().computeIfAbsent("allSubscriptions", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("allSubscriptions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("allSubscriptions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("allSubscriptions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("allSubscriptions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("allSubscriptions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("AppSubscriptionSortKeys"));
    getInputArguments().get("allSubscriptions").add(sortKeyArg);
    return projection;
  }

  public AppProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public ChannelProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> channel() {
     ChannelProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());
     getFields().put("channel", projection);
     return projection;
  }

  public AppCreditConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> credits(
      ) {
     AppCreditConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppCreditConnectionProjection<>(this, getRoot());
     getFields().put("credits", projection);
     return projection;
  }

  public AppCreditConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> credits(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppTransactionSortKeys sortKey) {
    AppCreditConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppCreditConnectionProjection<>(this, getRoot());    
    getFields().put("credits", projection);
    getInputArguments().computeIfAbsent("credits", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("credits").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("credits").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("credits").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("credits").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("credits").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("credits").add(sortKeyArg);
    return projection;
  }

  public AppCreditConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> creditsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    AppCreditConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppCreditConnectionProjection<>(this, getRoot());    
    getFields().put("credits", projection);
    getInputArguments().computeIfAbsent("credits", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("credits").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("credits").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("credits").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("credits").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("credits").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("AppTransactionSortKeys"));
    getInputArguments().get("credits").add(sortKeyArg);
    return projection;
  }

  public MetafieldProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys, false, null);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public MetafieldConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keysReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))));
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public AppPurchaseOneTimeConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> oneTimePurchases(
      ) {
     AppPurchaseOneTimeConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppPurchaseOneTimeConnectionProjection<>(this, getRoot());
     getFields().put("oneTimePurchases", projection);
     return projection;
  }

  public AppPurchaseOneTimeConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> oneTimePurchases(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppTransactionSortKeys sortKey) {
    AppPurchaseOneTimeConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppPurchaseOneTimeConnectionProjection<>(this, getRoot());    
    getFields().put("oneTimePurchases", projection);
    getInputArguments().computeIfAbsent("oneTimePurchases", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("oneTimePurchases").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("oneTimePurchases").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("oneTimePurchases").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("oneTimePurchases").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("oneTimePurchases").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("oneTimePurchases").add(sortKeyArg);
    return projection;
  }

  public AppPurchaseOneTimeConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> oneTimePurchasesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    AppPurchaseOneTimeConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppPurchaseOneTimeConnectionProjection<>(this, getRoot());    
    getFields().put("oneTimePurchases", projection);
    getInputArguments().computeIfAbsent("oneTimePurchases", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("oneTimePurchases").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("oneTimePurchases").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("oneTimePurchases").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("oneTimePurchases").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("oneTimePurchases").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("AppTransactionSortKeys"));
    getInputArguments().get("oneTimePurchases").add(sortKeyArg);
    return projection;
  }

  public PublicationProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> publication(
      ) {
     PublicationProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public AppRevenueAttributionRecordConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> revenueAttributionRecords(
      ) {
     AppRevenueAttributionRecordConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppRevenueAttributionRecordConnectionProjection<>(this, getRoot());
     getFields().put("revenueAttributionRecords", projection);
     return projection;
  }

  public AppRevenueAttributionRecordConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> revenueAttributionRecords(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppRevenueAttributionRecordSortKeys sortKey) {
    AppRevenueAttributionRecordConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppRevenueAttributionRecordConnectionProjection<>(this, getRoot());    
    getFields().put("revenueAttributionRecords", projection);
    getInputArguments().computeIfAbsent("revenueAttributionRecords", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("revenueAttributionRecords").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("revenueAttributionRecords").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("revenueAttributionRecords").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("revenueAttributionRecords").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("revenueAttributionRecords").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("revenueAttributionRecords").add(sortKeyArg);
    return projection;
  }

  public AppRevenueAttributionRecordConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> revenueAttributionRecordsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    AppRevenueAttributionRecordConnectionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppRevenueAttributionRecordConnectionProjection<>(this, getRoot());    
    getFields().put("revenueAttributionRecords", projection);
    getInputArguments().computeIfAbsent("revenueAttributionRecords", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("revenueAttributionRecords").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("revenueAttributionRecords").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("revenueAttributionRecords").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("revenueAttributionRecords").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("revenueAttributionRecords").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("AppRevenueAttributionRecordSortKeys"));
    getInputArguments().get("revenueAttributionRecords").add(sortKeyArg);
    return projection;
  }

  public AppSubscriptionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> subscriptions(
      ) {
     AppSubscriptionProjection<AppInstallationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionProjection<>(this, getRoot());
     getFields().put("subscriptions", projection);
     return projection;
  }

  public AppInstallationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppInstallationFragmentProjection<PARENT, ROOT> launchUrl() {
    getFields().put("launchUrl", null);
    return this;
  }

  public AppInstallationFragmentProjection<PARENT, ROOT> uninstallUrl() {
    getFields().put("uninstallUrl", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppInstallation {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
