package com.shopify.admin.types;

/**
 * The role of the theme.
 */
public enum ThemeRole {
  /**
   * The currently published theme. There can only be one main theme at any time.
   */
  MAIN,

  /**
   * The theme is currently not published. It can be transitioned to the main role if it is published by the merchant.
   */
  UNPUBLISHED,

  /**
   * The theme is installed as a trial from the Shopify Theme Store. It can be
   * customized using the theme editor, but access to the code editor and the
   * ability to publish the theme are restricted until it is purchased.
   */
  DEMO,

  /**
   * The theme is automatically created by the CLI for previewing purposes when in a development session.
   */
  DEVELOPMENT,

  /**
   * The theme is archived if a merchant changes their plan and exceeds the maximum
   * number of themes allowed. Archived themes can be downloaded by merchant, but
   * can not be customized or published until the plan is upgraded.
   */
  ARCHIVED,

  /**
   * The theme is locked if it is identified as unlicensed. Customization and
   * publishing are restricted until the merchant resolves the licensing issue.
   */
  LOCKED,

  /**
   * The currently published theme that is only accessible to a mobile client.
   */
  MOBILE
}
