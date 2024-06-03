package com.applicationtls.tools.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH&J\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/applicationtls/tools/data/repository/ReminderRepository;", "", "add", "", "reminder", "Lcom/applicationtls/tools/ui/reminder/domain/ReminderModel;", "(Lcom/applicationtls/tools/ui/reminder/domain/ReminderModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "getData", "Lkotlinx/coroutines/flow/Flow;", "", "update", "app_debug"})
public abstract interface ReminderRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object add(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.ui.reminder.domain.ReminderModel reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.ui.reminder.domain.ReminderModel reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.ui.reminder.domain.ReminderModel reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.applicationtls.tools.ui.reminder.domain.ReminderModel>> getData();
}