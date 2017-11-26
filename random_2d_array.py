# created by jenny trac
# created on Nov 23 2017
# program lets user choose how many rows and columns
# program shows all the numbers and calculates the average

import ui
from numpy import random

minimum = 1
maximum = 50

def make_the_array(rows, columns):
    # created the array with random numbers
    
    global minimum
    global maximum
    
    if rows >= 0 and columns >= 0:
        the_array = range(rows)
        for row_counter in the_array:
            the_array[row_counter] = range(columns)
            for column_counter in range (0 , columns):
                the_array[row_counter][column_counter] = random.randint(minimum, maximum)
        #print the_array
    
        return the_array
    
    else:
    
        return "-1"
    
def calculate_average(the_2d_array):
    # calulates average of a 2d array
    
    total = 0
    
    for every_row in the_2d_array:
        for every_column in every_row:
            total = total + every_column
    average = total / len(the_2d_array)
    
    return average

def generate_touch_up_inside(sender):
    # button to make array, show average and show all numbers
    
    # input
    number_of_rows = int(view['rows_textfield'].text)
    number_of_columns = int(view['columns_textfield'].text)
    
    #process
    random_array = make_the_array(number_of_rows, number_of_columns)
    if random_array == "-1":
        view['array_textview'].text = str(random_array)
        view['average_label'].text = str(random_array)
    else:
        average_of_array = calculate_average(random_array)
    
        #output
        view['array_textview'].text = str(random_array)
        view['average_label'].text = "The average is: " + str(average_of_array)

view = ui.load_view()
view.present('sheet')
