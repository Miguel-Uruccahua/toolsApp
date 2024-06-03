package com.applicationtls.tools.data.local.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/applicationtls/tools/data/local/di/DatabaseModule;", "", "()V", "provideAppDatabase", "Lcom/applicationtls/tools/data/local/database/AppDatabase;", "appContext", "Landroid/content/Context;", "provideReminderDao", "Lcom/applicationtls/tools/data/local/database/reminder/ReminderDao;", "appDatabase", "provideToolsDao", "Lcom/applicationtls/tools/data/local/database/tools/ToolsDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.applicationtls.tools.data.local.database.tools.ToolsDao provideToolsDao(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.data.local.database.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.applicationtls.tools.data.local.database.reminder.ReminderDao provideReminderDao(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.data.local.database.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.applicationtls.tools.data.local.database.AppDatabase provideAppDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        return null;
    }
}