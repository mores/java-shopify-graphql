package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.AppRevenueAttributionRecordSortKeys;
import com.shopify.admin.types.AppSubscriptionSortKeys;
import com.shopify.admin.types.AppTransactionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CurrentAppInstallationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CurrentAppInstallationProjectionRoot() {
    super(null, null, java.util.Optional.of("AppInstallation"));
  }

  public CurrentAppInstallationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> accessScopes(
      ) {
    AccessScopeProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("accessScopes", projection);
    return projection;
  }

  public AppSubscriptionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> activeSubscriptions(
      ) {
    AppSubscriptionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionProjection<>(this, this);    
    getFields().put("activeSubscriptions", projection);
    return projection;
  }

  public AppSubscriptionConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> allSubscriptions(
      ) {
    AppSubscriptionConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionConnectionProjection<>(this, this);    
    getFields().put("allSubscriptions", projection);
    return projection;
  }

  public AppSubscriptionConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> allSubscriptions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppSubscriptionSortKeys sortKey) {
    AppSubscriptionConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionConnectionProjection<>(this, this);    
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

  public AppSubscriptionConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> allSubscriptionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    AppSubscriptionConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionConnectionProjection<>(this, this);    
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

  public AppProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public ChannelProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> channel(
      ) {
    ChannelProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new ChannelProjection<>(this, this);    
    getFields().put("channel", projection);
    return projection;
  }

  public AppCreditConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> credits(
      ) {
    AppCreditConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppCreditConnectionProjection<>(this, this);    
    getFields().put("credits", projection);
    return projection;
  }

  public AppCreditConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> credits(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppTransactionSortKeys sortKey) {
    AppCreditConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppCreditConnectionProjection<>(this, this);    
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

  public AppCreditConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> creditsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    AppCreditConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppCreditConnectionProjection<>(this, this);    
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

  public MetafieldProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public AppPurchaseOneTimeConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> oneTimePurchases(
      ) {
    AppPurchaseOneTimeConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppPurchaseOneTimeConnectionProjection<>(this, this);    
    getFields().put("oneTimePurchases", projection);
    return projection;
  }

  public AppPurchaseOneTimeConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> oneTimePurchases(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppTransactionSortKeys sortKey) {
    AppPurchaseOneTimeConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppPurchaseOneTimeConnectionProjection<>(this, this);    
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

  public AppPurchaseOneTimeConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> oneTimePurchasesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    AppPurchaseOneTimeConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppPurchaseOneTimeConnectionProjection<>(this, this);    
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

  public PublicationProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> publication(
      ) {
    PublicationProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new PublicationProjection<>(this, this);    
    getFields().put("publication", projection);
    return projection;
  }

  public AppRevenueAttributionRecordConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> revenueAttributionRecords(
      ) {
    AppRevenueAttributionRecordConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppRevenueAttributionRecordConnectionProjection<>(this, this);    
    getFields().put("revenueAttributionRecords", projection);
    return projection;
  }

  public AppRevenueAttributionRecordConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> revenueAttributionRecords(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppRevenueAttributionRecordSortKeys sortKey) {
    AppRevenueAttributionRecordConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppRevenueAttributionRecordConnectionProjection<>(this, this);    
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

  public AppRevenueAttributionRecordConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> revenueAttributionRecordsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    AppRevenueAttributionRecordConnectionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppRevenueAttributionRecordConnectionProjection<>(this, this);    
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

  public AppSubscriptionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> subscriptions(
      ) {
    AppSubscriptionProjection<CurrentAppInstallationProjectionRoot<PARENT, ROOT>, CurrentAppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionProjection<>(this, this);    
    getFields().put("subscriptions", projection);
    return projection;
  }

  public CurrentAppInstallationProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CurrentAppInstallationProjectionRoot<PARENT, ROOT> launchUrl() {
    getFields().put("launchUrl", null);
    return this;
  }

  public CurrentAppInstallationProjectionRoot<PARENT, ROOT> uninstallUrl() {
    getFields().put("uninstallUrl", null);
    return this;
  }
}
