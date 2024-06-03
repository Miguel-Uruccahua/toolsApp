package com.applicationtls.tools.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/applicationtls/tools/data/repository/DefaultToolsRepository;", "Lcom/applicationtls/tools/data/repository/ToolsRepository;", "toolsDao", "Lcom/applicationtls/tools/data/local/database/tools/ToolsDao;", "(Lcom/applicationtls/tools/data/local/database/tools/ToolsDao;)V", "toolss", "Lkotlinx/coroutines/flow/Flow;", "", "", "getToolss", "()Lkotlinx/coroutines/flow/Flow;", "add", "", "name", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DefaultToolsRepository implements com.applicationtls.tools.data.repository.ToolsRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.applicationtls.tools.data.local.database.tools.ToolsDao toolsDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<java.lang.String>> toolss = null;
    
    @javax.inject.Inject()
    public DefaultToolsRepository(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.data.local.database.tools.ToolsDao toolsDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<java.lang.String>> getToolss() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object add(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}