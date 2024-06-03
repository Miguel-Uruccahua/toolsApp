package com.applicationtls.tools.data.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/applicationtls/tools/data/di/DataModule;", "", "bindsReminderRepository", "Lcom/applicationtls/tools/data/repository/ReminderRepository;", "reminderRepository", "Lcom/applicationtls/tools/data/repository/ReminderRepositoryImpl;", "bindsToolsRepository", "Lcom/applicationtls/tools/data/repository/ToolsRepository;", "toolsRepository", "Lcom/applicationtls/tools/data/repository/DefaultToolsRepository;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface DataModule {
    
    @javax.inject.Singleton()
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.applicationtls.tools.data.repository.ToolsRepository bindsToolsRepository(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.data.repository.DefaultToolsRepository toolsRepository);
    
    @javax.inject.Singleton()
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.applicationtls.tools.data.repository.ReminderRepository bindsReminderRepository(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.data.repository.ReminderRepositoryImpl reminderRepository);
}