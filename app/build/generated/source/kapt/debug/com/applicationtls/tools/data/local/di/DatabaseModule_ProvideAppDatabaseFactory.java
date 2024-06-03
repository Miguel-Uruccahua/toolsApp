package com.applicationtls.tools.data.local.di;

import android.content.Context;
import com.applicationtls.tools.data.local.database.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DatabaseModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final DatabaseModule module;

  private final Provider<Context> appContextProvider;

  public DatabaseModule_ProvideAppDatabaseFactory(DatabaseModule module,
      Provider<Context> appContextProvider) {
    this.module = module;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(module, appContextProvider.get());
  }

  public static DatabaseModule_ProvideAppDatabaseFactory create(DatabaseModule module,
      Provider<Context> appContextProvider) {
    return new DatabaseModule_ProvideAppDatabaseFactory(module, appContextProvider);
  }

  public static AppDatabase provideAppDatabase(DatabaseModule instance, Context appContext) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppDatabase(appContext));
  }
}
