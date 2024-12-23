package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.AppRevenueAttributionRecordSortKeys;
import com.shopify.types.AppSubscriptionSortKeys;
import com.shopify.types.AppTransactionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class AppInstallationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppInstallationProjectionRoot() {
    super(null, null, java.util.Optional.of("AppInstallation"));
  }

  public AppInstallationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> accessScopes(
      ) {
    AccessScopeProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("accessScopes", projection);
    return projection;
  }

  public AppSubscriptionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> activeSubscriptions(
      ) {
    AppSubscriptionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionProjection<>(this, this);    
    getFields().put("activeSubscriptions", projection);
    return projection;
  }

  public AppSubscriptionConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> allSubscriptions(
      ) {
    AppSubscriptionConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionConnectionProjection<>(this, this);    
    getFields().put("allSubscriptions", projection);
    return projection;
  }

  public AppSubscriptionConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> allSubscriptions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppSubscriptionSortKeys sortKey) {
    AppSubscriptionConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionConnectionProjection<>(this, this);    
    getFields().put("allSubscriptions", projection);
    getInputArguments().computeIfAbsent("allSubscriptions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("allSubscriptions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("allSubscriptions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("allSubscriptions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("allSubscriptions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("allSubscriptions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("allSubscriptions").add(sortKeyArg);
    return projection;
  }

  public AppProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public ChannelProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> channel(
      ) {
    ChannelProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new ChannelProjection<>(this, this);    
    getFields().put("channel", projection);
    return projection;
  }

  public AppCreditConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> credits(
      ) {
    AppCreditConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppCreditConnectionProjection<>(this, this);    
    getFields().put("credits", projection);
    return projection;
  }

  public AppCreditConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> credits(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppTransactionSortKeys sortKey) {
    AppCreditConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppCreditConnectionProjection<>(this, this);    
    getFields().put("credits", projection);
    getInputArguments().computeIfAbsent("credits", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("credits").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("credits").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("credits").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("credits").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("credits").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("credits").add(sortKeyArg);
    return projection;
  }

  public MetafieldProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public AppPurchaseOneTimeConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> oneTimePurchases(
      ) {
    AppPurchaseOneTimeConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppPurchaseOneTimeConnectionProjection<>(this, this);    
    getFields().put("oneTimePurchases", projection);
    return projection;
  }

  public AppPurchaseOneTimeConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> oneTimePurchases(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppTransactionSortKeys sortKey) {
    AppPurchaseOneTimeConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppPurchaseOneTimeConnectionProjection<>(this, this);    
    getFields().put("oneTimePurchases", projection);
    getInputArguments().computeIfAbsent("oneTimePurchases", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("oneTimePurchases").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("oneTimePurchases").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("oneTimePurchases").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("oneTimePurchases").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("oneTimePurchases").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("oneTimePurchases").add(sortKeyArg);
    return projection;
  }

  public PrivateMetafieldProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> privateMetafield(
      ) {
    PrivateMetafieldProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    return projection;
  }

  public PrivateMetafieldProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> privateMetafields(
      ) {
    PrivateMetafieldConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public PublicationProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> publication(
      ) {
    PublicationProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new PublicationProjection<>(this, this);    
    getFields().put("publication", projection);
    return projection;
  }

  public AppRevenueAttributionRecordConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> revenueAttributionRecords(
      ) {
    AppRevenueAttributionRecordConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppRevenueAttributionRecordConnectionProjection<>(this, this);    
    getFields().put("revenueAttributionRecords", projection);
    return projection;
  }

  public AppRevenueAttributionRecordConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> revenueAttributionRecords(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppRevenueAttributionRecordSortKeys sortKey) {
    AppRevenueAttributionRecordConnectionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppRevenueAttributionRecordConnectionProjection<>(this, this);    
    getFields().put("revenueAttributionRecords", projection);
    getInputArguments().computeIfAbsent("revenueAttributionRecords", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("revenueAttributionRecords").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("revenueAttributionRecords").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("revenueAttributionRecords").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("revenueAttributionRecords").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("revenueAttributionRecords").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("revenueAttributionRecords").add(sortKeyArg);
    return projection;
  }

  public AppSubscriptionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> subscriptions(
      ) {
    AppSubscriptionProjection<AppInstallationProjectionRoot<PARENT, ROOT>, AppInstallationProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionProjection<>(this, this);    
    getFields().put("subscriptions", projection);
    return projection;
  }

  public AppInstallationProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppInstallationProjectionRoot<PARENT, ROOT> launchUrl() {
    getFields().put("launchUrl", null);
    return this;
  }

  public AppInstallationProjectionRoot<PARENT, ROOT> uninstallUrl() {
    getFields().put("uninstallUrl", null);
    return this;
  }
}
