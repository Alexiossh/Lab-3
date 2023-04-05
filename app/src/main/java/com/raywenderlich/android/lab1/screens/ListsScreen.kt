import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

private val items=listOf(
    BookCategory(
        R.string.android,
        listOf(
            R.drawable.android_aprentice,
            R.drawable.saving_data_android,
            R.drawable.advanced_architecture_android
        )
    ),
    BookCategory(
        R.string.kotlin,
        listOf(
            R.drawable.kotlin_coroutines,
            R.drawable.kotlin_aprentice
        )
    ),
    BookCategory(
        R.string.swift,
        listOf(
            R.drawable.combine,
            R.drawable.rx_swift,
            R.drawable.swift_apprentice,
        )
    ),


        BookCategory(
            R.string.ios,
            listOf(
                R.drawable.core_data,
                R.drawable.ios_apprentice,
            )
        )
        )



@Composable
fun ListScreen(){
    MyList()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyList() {
    LazyColumn{
        items(items){item ->ListItem(item)}
    }
}
@Composable
fun ListItem(bookCategory: BookCategory, modifier: Modifier=Modifier){
Column(modifier=Modifier.pudding(8.dp)){
    Text(
        text=stringResource(bookCategory.categoryResourceId),
        fontSize=22.sp,
        fontWeight=FontWeight.Bold,
        color=colorResource(id=R.color.colorPrimary)
    )
    Spacer(modifier=modifier.height(8.dp))
    LazyRow{
        items(bookCategory.bookImageResource){items->BookImage(items)}
    }
}
}

@Composable
fun BookImage(imageResource: int){
    Image(
        modifier=Modifier.size(170.dp,200.dp),
        painter=paintResource(id=imageResource),
        contentScale=ContentScale.Fit,
        contentDescription=stringResource(R.string.jjj)
    )
}

data class BookCategory(
    @StringRes
    val categoryResourceId: Int,
    val bookImageResource: List<Int>
)
