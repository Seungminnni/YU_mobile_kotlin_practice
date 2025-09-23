<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello, World!"
    android:textSize="20sp"
    android:textColor="#FF5722"
    android:padding="16dp"
    android:background="#E0E0E0"
    android:gravity="center"/>
    <ImageView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:maxWidth="200dp"
    android:maxHeight="200dp"
    android:src="@drawable/sample_image"
    android:background="#CCCCCC" />

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="8dp">

    <Button
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="Button 1"
        android:background="#4CAF50"
        android:textColor="#FFFFFF" />

    <Button
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="Button 2"
        android:background="#2196F3"
        android:textColor="#FFFFFF" />
</LinearLayout>

<EditText
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Enter your name"
    android:inputType="textPersonName"
    android:padding="12dp"
    android:background="#F5F5F5"
    android:textColor="#000000"
    android:textSize="16sp"/>