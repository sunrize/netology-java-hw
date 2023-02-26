# Простой инструмент анализа статистики продаж

## Как работает менеджер продаж

```java
    public class SalesManager {
    protected int[] sales;
    
        public SalesManager(int[] sales) {
            this.sales = sales;
        }
    
        public int max() {
            int max = -1;
            for (int sale : sales) {
                if (sale > max) {
                    max = sale;
                }
            }
            return max;
        }
    }
```

Объекты класса SalesManager хранят данные об итоговых суммах продаж.

Метод max() возвращает самую крупную сумму.